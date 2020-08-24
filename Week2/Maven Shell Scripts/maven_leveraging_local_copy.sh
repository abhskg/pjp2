echo "Local copy of maven within project"

mvn -Dmaven.repo.local=$HOME/.my/other/repository clean install