<?php

function squares($a, $b){
	$count = 0;
	$closest_sqrt = floor(sqrt($a));

	//Checking if starting number is a square
	if($closest_sqrt**2 == $a)
		$count++;

	$closest_square = (++$closest_sqrt)**2;

	//Checking for the rest of the squares,
	//taking squares starting from the square
	//after the "$a"
	while($closest_square <= $b){
		$count++;
		$closest_square = (++$closest_sqrt)**2;
	}

	return $count;
}

echo squares(17,24)
?>