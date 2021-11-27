<?php
function minimumDistances($a){
	$a_len = count($a);
	$min = $a_len+1;

	for($i = 0; $i < $a_len; $i++){
		$num = $a[$i];
		if(!isset($d[$num]))
			$d[$num] = $i;
		else{
			$diff = abs($d[$num]-$i);
			$d[$num] = $i;

			if($diff < $min)
				$min = $diff;
		}
	}

	return $min < $a_len ? $min : -1;
}

echo minimumDistances([1,1,2,3,4,1]);
?>