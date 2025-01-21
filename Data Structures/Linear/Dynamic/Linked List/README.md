# Linked List Document

## Overview

>A linked list is a fundamental data structure used in computer science to store a collection of elements. Unlike arrays, which store elements in contiguous memory locations, linked lists consist of nodes that are connected through pointers. This allows for dynamic memory allocation and efficient insertion and deletion operations.

## Table of Contents

- [Terminologies](#terminologies)
- [Structure of a Linked List](#structure-of-a-linked-list)
- [Variants of Linked Lists](#variants-of-linked-lists)
- [Features](#features)
- [Comparison with Other Data Structures](#comparison-with-other-data-structures)
- [Use Cases of Linked Lists](#use-cases-of-linked-lists)
- [Summary of Linked Lists](#summary-of-linked-lists)


## Terminologies

- **Node:** The fundamental building block of a linked list, containing data and one or more pointers to other nodes.
- **Head:** The first node in the linked list, which serves as the starting point for traversal.
- **Tail:** The last node in the linked list, which typically points to null (or None in some programming languages) in singly linked lists, or back to the head in circular linked lists.
- **Next:** In singly linked lists, this is a pointer/reference in a node that points to the next node in the sequence.
- **Prev:** In doubly linked lists, this is a pointer/reference in a node that points to the previous node in the sequence.
- **Data:** The value or information stored in a node.
- **Traversal:** The process of visiting each node in the linked list, starting from the head and following the pointers until reaching the end.
- **Insertion:** The operation of adding a new node to the linked list. This can occur at the beginning, end, or at a specific position in the list.
- **Deletion:** The operation of removing a node from the linked list. This can also occur at the beginning, end, or at a specific position.
- **Search:** The operation of finding a node with a specific value in the linked list.
- **Length:** The number of nodes in the linked list.
- **Empty List:** A linked list that has no nodes, typically indicated by the head being null.
- **Singly Linked List:** A type of linked list where each node contains a single pointer to the next node.

    Representation:
   >![LinkedList](/images/linked%20list/Single%20Linked%20List.svg)
- **Doubly Linked List:** A type of linked list where each node contains two pointers: one pointing to the next node and another pointing to the previous node.

    Representation:
   >![LinkedList](/images/linked%20list/Doubly%20Linked%20List.svg)
- **Circular Linked List:** A type of linked list where the last node points back to the head, creating a circular structure.
    Representation:
   >![LinkedList](/images/linked%20list/Circular%20Linked%20List.svg)
- **Self-Referencing Structure:** A structure where a node contains a reference to another node of the same type, which is a characteristic of linked lists.
- **Memory Allocation:** The process of allocating memory for new nodes, which can be done dynamically during runtime.
- **Garbage Collection:** The process of reclaiming memory that is no longer in use, which is important in languages with manual memory management.


## Structure of a Linked List
- **Node:**  The basic unit of a linked list. Each node typically contains:
- **Data:** The value or information stored in the node.
Pointer/Reference: A reference to the next node in the list (in singly linked lists) or both the next and previous nodes (in doubly linked lists).
- **Head:** The first node in the linked list. It serves as the entry point for accessing the list.
- **Tail:** The last node in the linked list, which points to null (or None in some programming languages) in singly linked lists, indicating the end of the list.

## Variants of Linked Lists

1. **Singly Linked List**
   - Each node contains data and a pointer to the next node in the sequence.
   - Traversal is only possible in one direction (from head to tail).
   - Simple and uses less memory compared to other variants.

2. **Doubly Linked List**
   - Each node contains data, a pointer to the next node, and a pointer to the previous node.
   - Allows traversal in both directions (forward and backward).
   - More memory overhead due to the additional pointer.

3. **Circular Linked List**
   - The last node points back to the first node, forming a circular structure.
   - Can be singly or doubly circular linked lists.
   - Useful for applications that require a continuous loop through the list.

4. **Circular Doubly Linked List**
   - Combines features of both circular and doubly linked lists.
   - Each node has pointers to both the next and previous nodes, and the last node points back to the first node, while the first node points back to the last node.
   - Allows for bidirectional traversal in a circular manner.

5. **Skip List**
   - A layered linked list that allows for fast search, insertion, and deletion operations.
   - Each node may have multiple pointers that skip over several nodes, enabling logarithmic time complexity for search operations.
   - Often used in applications requiring efficient search operations.

6. **Unrolled Linked List**
   - A variant where each node contains an array of elements instead of a single element.
   - Reduces the overhead of pointers and improves cache performance.
   - Useful for applications that require efficient memory usage and fast access.

7. **Self-Adjusting List**
   - A linked list that adjusts its structure based on access patterns, moving frequently accessed nodes closer to the head.
   - Can improve access times for certain workloads.

8. **Multi-Linked List**
   - Each node can have multiple pointers to different lists or nodes, allowing for more complex relationships.
   - Useful in applications like representing graphs or complex data structures.


## Features

1. **Dynamic Size**: Singly linked lists can grow and shrink in size dynamically as elements are added or removed.
2. **Node Structure**: Each node contains data and a next pointer.
3. **Sequential Access**: Elements are accessed sequentially from the head.
4. **Insertion and Deletion**: Efficient operations, especially at the head.
5. **No Contiguous Memory Allocation**: Nodes are not stored in contiguous memory locations.
6. **Single Direction**: The list is traversed in a single direction.
7. **Memory Overhead**: Each node requires additional memory for the pointer/reference.
8. **Reversibility**: A singly linked list can be reversed, but it requires additional operations.
9. **Implementation of Other Data Structures**: Can be used to implement stacks, queues, and hash tables.
10. **No Random Access**: Elements cannot be accessed randomly.

## Comparison with Other Data Structures

| Feature                     | Singly Linked List    | Doubly Linked List       | Array                     |
|-----------------------------|-----------------------|--------------------------|---------------------------|
| Memory Allocation           | Non-contiguous        | Non-contiguous           | Contiguous                |
| Insertion at Head           | O(1)                  | O(1)                     | O(n)                      |
| Insertion at Tail           | O(n)                  | O(1) (with tail pointer) | O(1) (if space available) |
| Deletion at Head            | O(1)                  | O(1)                     | O(n)                      |
| Random Access               | No                    | No                       | Yes                       |
| Memory Overhead             | Low (1 pointer)       | Higher (2 pointers)      | None                      |
| Traversal Direction         | Single direction      | Both directions          | Single direction          |

## Use Cases of Linked Lists

1. **Dynamic Memory Allocation**
   - Linked lists can grow and shrink in size dynamically, making them suitable for applications where the number of elements is not known in advance.

2. **Implementing Stacks and Queues**
   - Linked lists can be used to implement stack (LIFO) and queue (FIFO) data structures, allowing for efficient insertion and deletion of elements.

3. **Sparse Matrices**
   - In applications involving sparse matrices, linked lists can be used to store only the non-zero elements, saving memory compared to traditional array representations.

4. **Adjacency Lists for Graphs**
   - Linked lists are often used to represent graphs in the form of adjacency lists, where each vertex points to a list of its adjacent vertices.

5. **Undo Functionality in Applications**
   - Many applications, such as text editors, use linked lists to implement undo functionality, where each action is stored as a node in a linked list.

6. **Memory Management**
   - Linked lists can be used in memory management systems to keep track of free and allocated memory blocks, allowing for efficient allocation and deallocation.

7. **Real-time Applications**
   - In real-time systems where time constraints are critical, linked lists can be used to manage tasks or processes that need to be executed in a specific order.

8. **Polynomial Representation**
   - Linked lists can be used to represent polynomials, where each node contains a coefficient and an exponent, allowing for efficient polynomial operations.

9. **Music Playlist Management**
   - In media players, linked lists can be used to manage playlists, allowing for easy insertion, deletion, and traversal of songs.

10. **Browser History**
    - Linked lists can be used to implement browser history, where each page visited is a node, allowing for easy navigation back and forth.

## Summary of Linked Lists

A **linked list** is a linear data structure where elements, called nodes, are stored in a sequence. Each node contains two main components: the data and a reference (or pointer) to the next node in the sequence. This structure allows for efficient insertion and deletion of elements, as it does not require shifting elements like arrays do.

### Key Characteristics

- **Dynamic Size**: Linked lists can grow and shrink in size dynamically, making them suitable for applications where the number of elements is not known in advance.
- **Non-contiguous Memory Allocation**: Nodes can be scattered throughout memory, allowing for efficient use of memory.
- **Sequential Access**: Nodes are accessed sequentially, which can lead to slower access times compared to arrays.

### Common Variants

1. **Singly Linked List**: Each node points to the next node; traversal is one-way.
2. **Doubly Linked List**: Each node points to both the next and previous nodes; allows bidirectional traversal.
3. **Circular Linked List**: The last node points back to the first node, forming a circular structure.
4. **Skip List**: A layered linked list that allows for fast search operations by skipping over nodes.
5. **Unrolled Linked List**: Each node contains an array of elements, reducing pointer overhead and improving cache performance.

### Use Cases

Linked lists are used in various applications, including:

- Implementing stacks and queues
- Managing dynamic memory allocation
- Representing graphs and adjacency lists
- Implementing undo functionality in applications
- Managing playlists in media players

## Conclusion

Linked lists are a versatile and efficient data structure that provides flexibility for dynamic data management. Understanding their characteristics, variants, and use cases is essential for selecting the appropriate data structure for specific programming challenges.
