def listComparison(list1, list2):
    foo = 0
    for val in list1:
        if val in list2:
            foo += 0
        else:
            foo += 1
    if foo == 0:
        return True
    else:
        return False
