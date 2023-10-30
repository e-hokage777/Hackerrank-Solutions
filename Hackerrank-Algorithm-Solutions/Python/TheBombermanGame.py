import sys

states = {"alt2": 0, "full": 1, "alt": 2}

def bomberMan(n, grid):
    current_state = states["alt2"]
    
    if n > 1:
        if n%2 == 0:
            current_state = states["full"]
        elif in_alt_series(n):
            current_state = states["alt"]
    else:
        return grid

    return create_ans_grid(grid, current_state)

def create_ans_grid(grid, state):
    match state:
        case 0:
            return create_alt_grid(create_alt_grid(grid))
        case 1:
            return create_full_grid(grid)
        case 2:
            print("alting")
            return create_alt_grid(grid)
        

def create_full_grid(grid):
    r = len(grid)
    c = len(grid[0])

    return ["O"*c]*r

def create_alt_grid(grid):
    full_grid = create_full_grid(grid)
    full_grid = list(map(list, full_grid))
    nr = len(grid)
    nc = len(grid[0])

    for r in range(nr):
        for c in range(nc):
            if grid[r][c] == "O":
                full_grid[r][c] = "."
                left = 0 if c-1 < 0 else c-1
                right = nc-1 if c+1 > nc-1 else c+1
                up = 0 if r-1 < 0 else r-1
                down = nr-1 if r+1 > nr-1 else r+1

                full_grid[r][left] = "."
                full_grid[r][right] = "."
                full_grid[up][c] = "."
                full_grid[down][c] = "."
    
    return list(map(lambda x: "".join(x), full_grid))

def in_alt_series(n):
    return (n+1)%4 == 0


if __name__=="__main__":
    lines = input("Enter rows (space separated):")
    lines = lines.split(",")
    n = int(input("Number of seconds: "))
    print(bomberMan(n, lines))