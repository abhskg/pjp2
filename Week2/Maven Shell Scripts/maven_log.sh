echo "Enter the file name to caplture logs"

read log

echo "Enter the maven command : "

read command 

#$command --log-file $log
$command -l

echo "Log file generated"