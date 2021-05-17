const LinkedList = require('./LinkedList')

describe('#insertAtHead', () => {
  test('it adds the element to the beginning of the list', () => {
    const ll = new LinkedList()
    ll.insertAtHead(10)
    const oldHead = ll.head
    ll.insertAtHead(20)

    expect(ll.head.value).toBe(20)
    expect(ll.head.next).toBe(oldHead)
    expect(ll.length).toBe(2)
  })
})

describe('#getByIndex', () => {
  describe('with index less than 0', () => {
    test('it returns null', () => {
      const ll = LinkedList.fromValues(10, 20)

      expect(ll.getByIndex(-1)).toBeNull()
    })
  })

  describe('with index greater than list length', () => {
    test('it returns null', () => {
      const ll = LinkedList.fromValues(10, 20)

      expect(ll.getByIndex(5)).toBeNull()
    })
  })

  describe('with index 0', () => {
    test('it returns the head', () => {
      const ll = LinkedList.fromValues(10, 20)

      expect(ll.getByIndex(0).value).toBe(10)
    })
  })

  describe('with index in the middle', () => {
    test('it returns the element at that index', () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40)

      expect(ll.getByIndex(2).value).toBe(30)
    })
  })
})

describe('#insertAtIndex', () => {
  describe('with index less than 0', () => {
    test('it does not insert anything', () => {
      const ll = LinkedList.fromValues(10, 20)
      ll.insertAtIndex(-1, 30)
      
      expect(ll.length).toBe(2)
    })
  })

  describe('with index greater than list length', () => {
    test('it does not insert anything', () => {
      const ll = LinkedList.fromValues(10, 20)
      ll.insertAtIndex(5, 30)

      expect(ll.length).toBe(2)
    })
  })

  describe('with index 0', () => {
    test('insert at the head', () => {
      const ll = LinkedList.fromValues(10, 20)
      ll.insertAtIndex(0, 30)

      expect(ll.head.value).toBe(30)
      expect(ll.head.next.value).toBe(10)
      expect(ll.length).toBe(3)
    })
  })

  describe('with index in the middle', () => {
    test('insert at the given index', () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40)
      ll.insertAtIndex(2, 50)
      const node = ll.getByIndex(2)

      expect(node.value).toBe(50)
      expect(node.next.value).toBe(30)
      expect(ll.length).toBe(5)
    })
  })
})

describe('#removeHead', () => {
  test('removes the head', () => {
    const ll = LinkedList.fromValues(10, 20, 30)
    ll.removeHead()

    expect(ll.head.value).toBe(20)
    expect(ll.length).toBe(2)
  })
})

describe('#removeAtIndex', () => {
  describe('with index less than 0', () => {
    test('it does not remove anything', () => {
      const ll = LinkedList.fromValues(10, 20)
      ll.removeAtIndex(-1)

      expect(ll.length).toBe(2)
    })
  })

  describe('with index greater than list length', () => {
    test('it does not remove anything', () => {
      const ll = LinkedList.fromValues(10, 20)
      ll.removeAtIndex(-1)
      
      expect(ll.length).toBe(2)
    })
  })

  describe('with index 0', () => {
    test('remove the head', () => {
      const ll = LinkedList.fromValues(10, 20, 30)
      ll.removeAtIndex(0)

      expect(ll.head.value).toBe(20)
      expect(ll.head.next.value).toBe(30)
      expect(ll.length).toBe(2)
    })
  })

  describe('with index in the middle', () => {
    test('remove at the given index', () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40)
      ll.removeAtIndex(2)
      const node = ll.getByIndex(1)

      expect(node.value).toBe(20)
      expect(node.next.value).toBe(40)
      expect(ll.length).toBe(3)
    })
  })
})

describe("#detectLoop", () => {
  
  describe("start scanning from head, Loop back to head", () => {
    test("should return found true and detected position from where loop happened", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50);
      ll.head.next.next.next = ll.head; // 30 pointing back to 10
      const result = ll.detectLoop();
      expect(result.found).toBe(true);
      expect(result.detectedAt).toBe(30);
    });
  });

  describe("start scanning from head, Loop back to some element in the middle", () => {
    test("should return found true and detected position from where loop happened", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120);
      ll.head.next.next.next.next.next.next.next = ll.head.next.next; // 70 pointing back to 30
      const result = ll.detectLoop(ll.head);
      expect(result.found).toBe(true);
      expect(result.detectedAt).toBe(70);
    });
  });

  describe("start scanning from user given node, loop back to some element in middle but after starting point", () => {
    test("should return found true and detected position to previous of starting point", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120);
      ll.head.next.next.next.next.next.next.next = ll.head.next.next; // 70 pointing back to 30
      let node = ll.head.next.next.next.next; // starting next of 40 i.e., from 50
      const result = ll.detectLoop(node);
      expect(result.found).toBe(true);
      expect(result.detectedAt).toBe(40); // because 40's next is 50 where we started
    });
  });

  describe("start scanning from user given node, loop back to head", () => {
    test("should return found true and detected position to previous of starting point", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120);
      ll.head.next.next.next.next.next.next.next = ll.head; // 70 pointing back to 10
      let node = ll.head.next.next.next; // starting next of 30 i.e., from 40
      const result = ll.detectLoop(node);
      expect(result.found).toBe(true);
      expect(result.detectedAt).toBe(30); // because 20's next is 30 where we started
    });
  });

  describe("start scanning from head, No loop present in the linkedlist", () => {
    test("should return found false and detected position null", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60);
      const result = ll.detectLoop(ll.head);
      expect(result.found).toBe(false);
      expect(result.detectedAt).toBe(null);
    });
  });

  describe("start scanning from user given node, No loop present in the linkedlist", () => {
    test("should return found false and detected position null", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60);
      const result = ll.detectLoop(ll.head.next.next); // start from 30
      expect(result.found).toBe(false);
      expect(result.detectedAt).toBe(null);
    });
  });
});

describe("#hasCycle", () => {
  
  describe("start scanning from head, Loop back to head", () => {
    test("should return found true and detected position from where loop happened", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50);
      ll.head.next.next.next = ll.head; // 30 pointing back to 10
      expect(ll.hasCycle()).toBe(true);
    });
  });

  describe("start scanning from head, Loop back to some element in the middle", () => {
    test("should return found true and detected position from where loop happened", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120);
      ll.head.next.next.next.next.next.next.next = ll.head.next.next; // 70 pointing back to 30
      expect(ll.hasCycle(ll.head)).toBe(true);
    });
  });

  describe("start scanning from user given node, loop back to some element in middle but after starting point", () => {
    test("should return found true and detected position to previous of starting point", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120);
      ll.head.next.next.next.next.next.next.next = ll.head.next.next; // 70 pointing back to 30
      let node = ll.head.next.next.next.next; // starting next of 40 i.e., from 50
      expect(ll.hasCycle(node)).toBe(true);
    });
  });

  describe("start scanning from user given node, loop back to head", () => {
    test("should return found true and detected position to previous of starting point", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120);
      ll.head.next.next.next.next.next.next.next = ll.head; // 70 pointing back to 10
      let node = ll.head.next.next.next; // starting next of 30 i.e., from 40
      expect(ll.hasCycle(node)).toBe(true);
    });
  });

  describe("start scanning from head, No loop present in the linkedlist", () => {
    test("should return found false and detected position null", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60);
      expect(ll.hasCycle(ll.head)).toBe(false);
    });
  });

  describe("start scanning from user given node, No loop present in the linkedlist", () => {
    test("should return found false and detected position null", () => {
      const ll = LinkedList.fromValues(10, 20, 30, 40, 50, 60);
      expect(ll.hasCycle(ll.head.next.next)).toBe(false);
    });
  });
});