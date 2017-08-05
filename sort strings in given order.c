//
//  main.c
//  sort strings
//
//  Created by Md Tahsin Sharif on 2017-03-19.
//  Copyright © 2017 Md Tahsin Sharif. All rights reserved.
//

#include "string.h"
#include <stdio.h>

const uint32_t lookup_table_size = 150;

void sort_string(char* order_of_string, char* msg){
    
    static char lookup_character[lookup_table_size];
    
    unsigned long length_msg= strlen(msg);
    unsigned long length_ordered_string= strlen(order_of_string);

    char output[length_msg], store;
    int count = 0;
    
    //create lookup table
    while(*msg!='\0'){
        lookup_character[(int)(*msg)] = *msg;
        printf("%c: %u\n", lookup_character[(int)(*msg)], (int)(*msg));
        ++msg;
    }
    
    //create output string
    for (int j=0; j<length_ordered_string; j++){
        store = *order_of_string;
        if (store == lookup_character[(int)(store)]){
            output[count] = *order_of_string;
            ++count;
        }
        ++order_of_string;
    }
    
    printf("Output String: %s\n", output);
}
int main(int argc, const char * argv[]) {
    char letters[] = "HbzeybxXcfghA";
    char word[] = "AXxHhyz";
    sort_string(letters,word);
    return 0;
}
