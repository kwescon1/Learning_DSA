# find the smallest item

def findSmallest(arr):
    smallest_number = arr[0]
    smallest_number_index = 0
    
    for i in range(1,len(arr)):
        if arr[i] < smallest_number:
            smallest_number = arr[i]
            smallest_number_index = i
            
    return smallest_number_index

def selectionSort(arr):
    newArray = []
    
    for i in range(1,len(arr)):
        smallestElement = findSmallest(arr)
        
        # remove element from old array and add element to new array
        newArray.append(arr.pop(smallestElement))
    
    return newArray




print(selectionSort([4,3,6,1]))
        
    
    