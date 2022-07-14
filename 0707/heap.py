class minheap:
    def __init__(self):
        self.h = [0]
    def insert(self,i):
        self.h.append(i)
        s =len(self.h)-1
        while s > 1 and self.h[s]  < self.h[s//2] :
            temp = self.h[s//2]
            self.h[s//2] = i
            self.h[s] =  temp
            s //=2
    def pop(self):
        if len(self.h) < 2: return 0
        if len(self.h) == 2:
            k = self.h.pop()
            return k
        tar = self.h[1]
        self.h[1] = self.h.pop()
        s = 1
        try:   
            while s*2 < len(self.h):
                min = self.h[s*2]
                lt = s*2
                if s*2+1 < len(self.h) and min > self.h[s*2+1]:
                    min = self.h[s*2+1]
                    lt = s*2+1
                if min > self.h[s]: break
                try:
                    print('부모노드:', self.h[s],'자식노드',self.h[s*2],self.h[s*2+1])
                except: pass
                temp = self.h[s]
                self.h[s] = self.h[lt]
                self.h[lt] = temp
                s = lt
        except:
            pass
        return tar
















class maxheap:
    def __init__(self):
        self.h = [0]
    def insert(self,i):
        self.h.append(i)
        s =len(self.h)-1
        while s > 1 and self.h[s]  > self.h[s//2] :
            temp = self.h[s//2]
            self.h[s//2] = i
            self.h[s] =  temp
            s //=2
    def pop(self):
        if len(self.h) < 2: return 0
        if len(self.h) == 2:
            k = self.h.pop()
            return k
        tar = self.h[1]
        self.h[1] = self.h.pop()
        s = 1
        try:   
            while s*2 < len(self.h):
                min = self.h[s*2]
                lt = s*2
                if s*2+1 < len(self.h) and min < self.h[s*2+1]:
                    min = self.h[s*2+1]
                    lt = s*2+1
                if min < self.h[s]: break
                try:
                    print('부모노드:', self.h[s],'자식노드',self.h[s*2],self.h[s*2+1])
                except: pass
                temp = self.h[s]
                self.h[s] = self.h[lt]
                self.h[lt] = temp
                s = lt
        except:
            pass
        return tar
