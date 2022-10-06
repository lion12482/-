import copy

def game(tile,t):
    ti  = 0
    qm = copy.deepcopy(tile)
    td = dict()
    print(len(tile),len(tile[0]),t,sum([x.count(True) for x in tile]))
    while ti < t:
        ti += 1
        su = sum([x.count(True) for x in qm])
        if su == 0 : 
            e = f'Dead End on {ti} turn'
            return e
        if td.get(su):
            if qm in td[su]:
                e =f'Endless pattern end on {ti} turn'
                return e
            else: td[su].append(qm)
        else: td[su] = [qm]
        nm = copy.deepcopy(qm)
        for x in range(len(tile)):
            for y in range(len(tile[0])):
                k = 0 
                for i in range(x-1,x+2):
                    for j in range(y-1,y+2):
                        try:
                            if i ==  x and j == y: pass
                            elif qm[i][j] == True: k += 1
                        except: pass
                if k == 3: 
                    nm[x][y] = True
                elif k == 2 and qm[x][y] ==True: 
                    nm[x][y] = True
                else: nm[x][y] = False
        qm = copy.deepcopy(nm)
    return qm

