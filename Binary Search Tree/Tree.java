package com.company;
public class Tree{

    private class Node{
        private int value;
        private float value1;
        private Node LeftChild;
        private Node RightChild;
        public Node(int value){
            this.value = value;
        }
        public Node(float value1){
            this.value1 = value1;
        }

        public String toString(){
            return "Node = "+value;
        }

    }

    private Node root;

    public void Insert(int value){
        if (root == null){
            root = new Node(value);
            return;
        }
        Node current = root;
        while (true){
            if (value <= current.value){
                if (current.LeftChild == null){
                    current.LeftChild = new Node(value);
                    break;
                }
                current = current.LeftChild;
            }
            else {
                if (current.RightChild == null){
                    current.RightChild = new Node(value);
                    break;
                }
                current = current.RightChild;
            }
        }
    }

    public void Insert(char value){
        if (root == null){
            root = new Node(value);
            return;
        }
        Node current = root;
        while (true){
            if (value <= current.value){
                if (current.LeftChild == null){
                    current.LeftChild = new Node(value);
                    break;
                }
                current = current.LeftChild;
            }
            else {
                if (current.RightChild == null){
                    current.RightChild = new Node(value);
                    break;
                }
                current = current.RightChild;
            }
        }
    }

    public void Insert(float value1){
        if (root == null){
            root = new Node(value1);
            return;
        }
        Node current = root;
        while (true){
            if (value1 <= current.value){
                if (current.LeftChild == null){
                    current.LeftChild = new Node(value1);
                    break;
                }
                current = current.LeftChild;
            }
            else {
                if (current.RightChild == null){
                    current.RightChild = new Node(value1);
                    break;
                }
                current = current.RightChild;
            }
        }
    }

    public boolean Find(float value){
        Node current = root;
        while (current != null){
            if (value < current.value){
                current = current.LeftChild;
            }
            else if (value > current.value){
                current = current.RightChild;
            }
            else {
                return true;
            }
        }
        return false;
    }


    public boolean Find(int value){
        Node current = root;
        while (current != null){
            if (value < current.value){
                current = current.LeftChild;
            }
            else if (value > current.value){
                current = current.RightChild;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public boolean Find(char value){
        Node current = root;
        while (current != null){
            if (value < current.value){
                current = current.LeftChild;
            }
            else if (value > current.value){
                current = current.RightChild;
            }
            else {
                return true;
            }
        }
        return false;
    }

    public void TraversePreOrder(){
        TraversePreOrder(root);
    }

    public void TraversePreOrder(Node root){
        if (root == null){
            return;
        }
        System.out.println(root.value+"");
        TraversePreOrder(root.LeftChild);
        TraversePreOrder(root.RightChild);
    }

    public void TraverseInOrderAsc(){
        TraverseInOrderAsc(root);
    }

    private void TraverseInOrderAsc(Node root){
        if (root == null){
            return;
        }
        TraverseInOrderAsc(root.LeftChild);
        System.out.println(root.value+"");
        TraverseInOrderAsc(root.RightChild);
    }
}
