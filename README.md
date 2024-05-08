# AVL-TREES

Georgy Adelson-Velsky and Evgenii Landis

AVL Trees are named after the inventors:Georgy Adelson-Velsky and Evgenii Landis,.
An AVL Tree can be defined as a self-balancing binary search tree (BST) a such that upon insertion of a new node
or removal of an existing node, it balances itself in terms of height. 

The runtime complexity of a Binary Search Tree is a function of the height of the tree - the longest path from the root of the tree to a leaf node.
Assuming a Tree has N number of nodes, let’s say that that every node has only zero or one child. Therefore its height equals N, and the search time in the worst case is O(N). So our main goal in a BST is to keep the maximum height close to log(N).

The AVL Tree checks the balance factor of its nodes after the insertion or deletion of a node. If the balance factor (difference in height of the farthest leaf Nodes) of a node is greater than one or less than 1, the tree rebalances itself.
There are two operations to rebalance a tree:
Right rotation  and
Left rotation.

The Right rotation is effected on a left skewed Tree and it is implemented in this code base as rightRotation().
The Left rotation is effected on a rightt skewed Tree and it is implemented in this code base as leftRotation().

The both methids are utilised in the avlBalance() method and are applied in required situations. 

The following are benefits of AVL Trees: 
It also provides faster search operations: The most important benefit of AVL trees is that they perform faster search operations than Binary Search Trees

Insertion and Deleting of Nodes also run in lower/faster runtime complexity.

AVL Trees can be applied in the following ways: 
-AVL Trees can be applied in Dictionaries, and other check and confirmation books/logs. 
-Indexing large amounts of data in a database and to search through it efficiently.
-Applications for databases where insertions and deletions are infrequent but frequent data searches are necessary.
-Software that requires improved search.
-Can be used in corporate settings and storyline games
