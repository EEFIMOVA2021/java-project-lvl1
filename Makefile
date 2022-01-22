clean:
	./gradlew clean
build: ./gradlew clean build
install:
	./gradlew clean install checkstyleMain
run-dist:
	./build/install/app/bin/app
run:
	./gradlew run
lint:
	./gradlew checkstyleMain
check-updates:
	./gradlew useLatestVersions