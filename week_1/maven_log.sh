echo "Enter the file name to caplture logs"

read log

echo "Enter the maven command : "

read command 

$command --log-file $log


echo "Log file generated"