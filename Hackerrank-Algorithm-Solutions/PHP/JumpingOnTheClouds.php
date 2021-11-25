<?php
function jumpingOnClouds($clouds) {
    // Write your code here
    $last_ind = count($clouds)-1;
    $start = 0;
    $jumps = 0;

    while($start < $last_ind){
        if(empty($clouds[$start+2]))
            $start+=2;
        else
            $start+=1;

        $jumps+=1;
    }

    return $jumps;
}

echo jumpingOnClouds([0, 0, 0, 0, 1, 0,0])
?>