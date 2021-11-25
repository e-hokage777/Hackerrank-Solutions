<?php
    function permutationEquation($p) {
    // Write your code here
    $len_of_arr = count($p);
    $result = [];
    
    for($i = 1; $i <= $len_of_arr; $i++){
        $index = array_search($i, $p) + 1;
        $yIndex = array_search($index, $p) + 1;
        array_push($result, $yIndex);
    }

    return $result;
    

}

    foreach(permutationEquation([4,3,5,1,2]) as $val)
        echo "<br>$val";
?>