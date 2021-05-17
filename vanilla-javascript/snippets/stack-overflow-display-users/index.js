let state = {
    data: ""
}

function getQuestions() {
    let content = "";
    return fetch("https://api.stackexchange.com/2.2/questions?site=stackoverflow")
        .then(result => {
            return result.json();
        })
        .then(
            questions => {
                questions.items.forEach(quest => {
                    let btnUI = '';
                    quest.tags.forEach(tag => {
                        btnUI += `<button type="button">${tag}</button>\n`;
                    });
                    let filedDetails = `
                        <div class='block'>
                            <div class="question-detail">
                                <h2>${quest.title}</h2>
                                <p>Find answer <a href="${quest.link}">here</a></p>
                                <div class="tags">
                                    ${btnUI}
                                </div>
                                <p>Number of answers : ${quest.answer_count} </p>
                            </div>
                            <div class="profile-detail">
                                <img src="${quest.owner.profile_image}" alt="">
                                <h3>${quest.owner.display_name}</h3>
                                <p><a href="${quest.owner.link} target='_blank'">Link to profile</a></p>
                            </div>
                        </div>
                    `
                    content += filedDetails;
                });
            })
        .then(
            () => content
        )
        .catch(error => console.log(error));
}

async function getUiData() {
    let data = await getQuestions();
    document.getElementById('root').innerHTML = data;
}

window.onload = getUiData();