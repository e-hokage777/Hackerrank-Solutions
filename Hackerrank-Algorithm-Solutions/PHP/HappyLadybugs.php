<?php
function happyLadyBugs($b){
	$b = str_split($b);
	$num_of_bugs = count($b);
	##When there are only two equal
	if($num_of_bugs == 2 and $b[0] == $b[1])
		return "YES";

	//Checking if all the lady bugs are already happy
	for($i = 1; $i < $num_of_bugs-1; $i++){
		if($b[$i] != $b[$i+1] and $b[$i] != $b[$i-1])
			break;

		if($i == $num_of_bugs-2){
			if($b[0] != $b[1] or $b[$num_of_bugs-1] != $b[$num_of_bugs-2])
				break;
			else
				return "YES";
		}
	}

	#Getting the number of each color
	$color_num = [];

	foreach($b as $color){
		if(isset($color_num[$color])){
			$color_num[$color] = $color_num[$color]+1;
		}
		else
			$color_num[$color] = 1;
	}

	##Checking if there are any empty spaces
	if(empty($color_num['_']))
		return "NO";


	unset($color_num["_"]);

	foreach($color_num as $num){
		if($num < 2)
			return "NO";
	}

	return "YES";
}

echo happyLadyBugs('_')
?>