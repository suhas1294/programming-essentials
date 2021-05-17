const rootFolder = {
    name: 'a',
    type: 'folder',
    files: [
        'f1',
        'f2',
        'f3',
        'f4',
    ],
    sub_folders: [
        {
            name: 'b',
            type: 'folder',
            files: ['f5', 'f6', 'f7'],
            sub_folders: {
                name: 'c',
                type: 'folder',
                files: ['f8', 'f9', 'f10']
            }
        },
        {
            name: 'e',
            type: 'folder',
            files: ['f5', 'f6', 'f7']
        }
    ]
}

function getTree(data){
    let treeHtml = "";
    if(data.sub_folders && data.sub_folders.length > 0){
        data.sub_folders.forEach(folder => getTree(folder));
    }else if(data.files && data.files.length > 0){
        let fileLiTag = data.files.map(f => `<li>${f}</li>`);
        // fileLiTag.unshift('<ul>');
        // fileLiTag.push('</ul>');
        let fileList = '';
        fileLiTag.forEach(f => fileList += f);
        fileList += `<p>${data.name}</p>${fileList}`;
        treeHtml += fileList;
    }
    console.log(`<ul>${treeHtml}</ul>`);
    return `${parentFolder}<ul>${treeHtml}</ul>`;
}

document.getElementById('root').insertAdjacentHTML('afterbegin', getTree(rootFolder));