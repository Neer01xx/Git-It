    #include <stdio.h>
    #include <stdlib.h>
    struct Node {
        int data;
        struct Node* next;
    };

    struct Node* insert(struct Node* root, int data) {
        struct Node* newNode = (struct Node*)malloc(sizeof(struct Node*));
        newNode->data = data;
        newNode->next = NULL;
        if(root == NULL) {
            return newNode;
        }
        struct Node* help = root;
        while(help->next != NULL) help = help->next;
        help->next = newNode;
        return root;
    }

    void print(struct Node* root) {
        if(root == NULL) {
            printf("NULL");
            return;
        }
        struct Node* help = root;
        while(help != NULL) {
            printf("%d ", help->data);
            help = help->next;
        }
    }

    int main()
    {
        struct Node* head = NULL;
        head = insert(head, 2);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 4);
        print(head);
    }