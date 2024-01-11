def binarySaerch(list,item):
    
    low = 0
    high = len(list) - 1
    
    while low <= high:
        midPoint = (low + high) // 2 #Integer division for midpoint
        
        guess = list[midPoint]
        
        if guess == item: 
            return midPoint # the position of the item
        
        if guess < item : # Item is in upper half of the list
            # increase the low to the next value after the midpoint value
            low = midPoint + 1
        else :
            # Item is in lower half of the list
            
            # decrease high to the value before the midpoint value
            
            high = midPoint - 1
        
    return None # Item not found



print(binarySaerch([1,3,4,5,7,9,45],5))