<?php

function appendAndDelete($str, $dstr, $nops){


    $init_arr = str_split($str);
    $des_arr = str_split($dstr);
    $str_len = count($init_arr);
    $d_len = count($des_arr);

    if($nops >= ($str_len+$d_len))
        return "Yes";

    if($str == $dstr && $nops%2 == 0)
        return "Yes";

    for($i = 0; $i < $d_len; $i++){
        if($init_arr[$i] != $des_arr[$i]){
            $diff_str = $str_len - $i;
            $diff_d = $d_len - $i;

            if($nops >= ($diff_d+$diff_str) and ($diff_d + $diff_str) % $nops == 0)
                return "Yes";
            elseif($nops > ($diff_d + $diff_str) and ($diff_d + $diff_str-$nops) %2 == 0){
                return "Yes";
            }
            else{
                return "No";
            }
        }
    }
    
    if(abs($str_len - $d_len) % 2 == 0 and $nops % 2 == 0)
        return "Yes";

    if(abs($str_len - $d_len) % 2 == 1 and $nops % 2 == 1)
        return "Yes";


    return "No";

    return "No";

}

echo appendAndDelete("hack", "hacks", 3);

?>