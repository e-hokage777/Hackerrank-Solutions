class Node:
    def __init__(self, info):
        self.info = info  
        self.left = None  
        self.right = None 
        self.level = None 

    def __str__(self):
        return str(self.info) 

def preOrder(root):
    if root == None:
        return
    print (root.info, end=" ")
    preOrder(root.left)
    preOrder(root.right)
    
class BinarySearchTree:
    def __init__(self): 
        self.root = None


    def insert(self, val):
        self.root = self.insert_util(self.root, val)
    
    def insert_util(self, root, val):
        if root == None:
            root = Node(val)
        else:
            if val < root.info:
                root.left = self.insert_util(root.left, val)
            else:
                root.right = self.insert_util(root.right, val)

        return root

tree = BinarySearchTree()
t = int(input())

arr = list(map(int, input().split()))

for i in range(t):
    tree.insert(arr[i])

preOrder(tree.root)
