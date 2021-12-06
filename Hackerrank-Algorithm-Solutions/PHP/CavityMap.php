<?php
function cavityMap($grid, $size) {
    if($size < 3)
        return $grid;

    for($i = 1; $i < ($size-1); $i++){
        for($j = 1; $j < ($size-1); $j++){
            $center = $grid[$i][$j];
            $left = $grid[$i][$j-1];
            $right = $grid[$i][$j+1];
            $top = $grid[$i-1][$j];
            $bottom = $grid[$i+1][$j];

            if($center > $top && $center > $right && $center > $bottom && $center > $left)
                $grid[$i][$j] = 'X';

        }
    }

    return $grid;
}

echo implode('<br>', cavityMap(['1112', '1912', '1892', '1234'], 4))
?>