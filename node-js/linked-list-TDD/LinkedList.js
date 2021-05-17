class Node {
  constructor(value, next) {
    this.value = value
    this.next = next
  }
}

class LinkedList {
  constructor() {
    this.head = null
    this.length = 0
  }

  insertAtHead(data) {
    const newNode = new Node(data, this.head)
    this.head = newNode
    this.length++
  }

  getByIndex(index) {
    if (index < 0 || index >= this.length) return null

    let current = this.head
    for (let i = 0; i < index; i++) {
      current = current.next
    }
    return current
  }

  removeHead() {
    this.head = this.head.next
    this.length--
  }

  insertAtIndex(index, value) {
    if (index === 0) return this.insertAtHead(value)

    const prev = this.getByIndex(index - 1)
    if (prev == null) return null

    prev.next = new Node(value, prev.next)
    this.length++
  }

  removeAtIndex(index) {
    if (index === 0) return this.removeHead()

    const prev = this.getByIndex(index - 1)
    if (prev == null) return null

    prev.next = prev.next.next
    this.length--
  }

  print() {
    let output = ''
    let current = this.head
    while (current) {
      output = `${output}${current.value} -> `
      current = current.next
    }
    console.log(`${output}null`)
  }

  detectLoop(node = this.head) {
    let temp = node;
    let nodeNextValues = [];
    while (temp.next) {
      if (nodeNextValues.includes(temp.next)) {
        return { found: true, detectedAt: temp.value };
      }
      nodeNextValues.push(temp);
      temp = temp.next;
    }
    return { found: false, detectedAt: null };
  }

  hasCycle(head = this.head) {
    // initial with fast and slow pointers with head
    let slow = head;
    let fast = head;
    //traverse linked list
    while (fast && fast.next) {
      // fast moves by two
      fast = fast.next.next;
      // slow moves by one
      slow = slow.next;
      // two pointers meet, cycle
      if (fast === slow) {
        return true;s
      }
    }
    return false;
  }

  findMiddle(){
    let slowPointer = this.head;
    let fastPointer = this.head;
    while(fastPointer && fastPointer.next){
      fastPointer = fastPointer.next.next;
      slowPointer = slowPointer.next;
    }
    return slowPointer.value;
  }
}

LinkedList.fromValues = function (...values) {
  const ll = new LinkedList()
  for (let i = values.length - 1; i >= 0; i--) {
    ll.insertAtHead(values[i])
  }
  return ll
}

module.exports = LinkedList