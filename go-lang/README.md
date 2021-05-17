* __Concurrency vs Parallesim__

1. 2006 - Intel released first dual core processor
2. 2007 - google started to build golang which natively takes advantage of moutiple cores.

3. Golang supports cuncurrency out of the box.

4. If you write code in go,and run that code on a machine that has only ONe core, your code is not going to un in parallel - you cannot have multiple threads in parallel runnning at the same time.

5. If you have multiple CPU - then your code is going to run in parallel.

6. Concurrency is a design patten - its a way of writing code. - you can have code that have potential to run in parallel

7. Concurrency does not gurantee that your code is not going to run in parallel