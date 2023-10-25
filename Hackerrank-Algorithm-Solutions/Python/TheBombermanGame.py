import sys

states = {"init": 0, "full": 1, "alt": 2}

def bomberman(n, grid):
    current_state = states["init"]
    
    if n > 1:
        if n%2 == 0:
            current_state = states["full"]
        elif in_alt_series:
            current_state = states["alt"]

    return create_ans_grid(grid, current_state)

def create_ans_grid(grid, state):
    match state:
        case 0:
            return grid
        case 1:
            return create_full_grid(grid)
        case 2:
            return create_alt_grid(grid)
        

def create_full_grid(grid):
    r = len(grid)
    c = len(grid[0])

    return ["O"*c]*r

def create_alt_grid(grid):
    full_grid = create_full_grid(grid)
    nr = len(grid)
    nc = len(grid[0])

    for r in range(nr):
        for c in range(nc):
            if grid[r][c] == "O":
                print("found")
                full_grid[r][c] = "."
                left = 0 if c-1 < 0 else c-1
                right = nc-1 if c+1 > nc-1 else c+1
                up = 0 if r-1 < 0 else r-1
                down = nr-1 if r+1 > nr-1 else r+1

                full_grid[r][left] = "."
                full_grid[r][right] = "."
                full_grid[up][c] = "."
                full_grid[down][c] = "."
    
    return full_grid

def in_alt_series(n):
    return ((n-5)/4)%4 == 0


if __name__=="__main__":
    lines = sys.stdin.readlines()
    lines = list(map(lambda x: x.strip(), lines))
    print(bomberman(5,lines))