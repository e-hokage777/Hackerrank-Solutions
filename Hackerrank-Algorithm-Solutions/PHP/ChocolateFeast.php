<?php
function chocolateFeast($n, $c, $m){
	#getting number of chocolates that can be bought
	$c_got = floor($n/$c);

	#initail number of wrappers
	$wrappers = $c_got;

	while($wrappers >= $m){
		$c_got_wrappers = floor($wrappers/$m);
		$c_got += $c_got_wrappers;
		$wrappers = $c_got_wrappers + $wrappers%$m;
	}

	return $c_got;
} 

echo chocolateFeast(6,2,2)
?>