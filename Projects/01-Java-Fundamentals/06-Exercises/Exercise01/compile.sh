exercise_name="$(basename $(pwd))" 
jar cvfm "$exercise_name.jar" manifest.txt -C "out/production/$exercise_name" .
