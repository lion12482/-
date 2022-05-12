for k in range(int(input())):
  xa,ya,ra,xb,yb,rb = map(int,input().split())
  if xa==xb and ya==yb: 
    if ra==rb:
      if ra ==0: print(1)
      else: print(-1)
    else: print(0)
  else:
    r = ((xb-xa)**2+(yb-ya)**2)**0.5
    if abs(ra-rb) < r and r < (ra+rb): print(2)
    elif r == ra + rb: print(1)
    elif r == abs(ra-rb): print(1)
    elif r < abs(ra-rb): print(0)
    elif r > (ra+rb): print(0)