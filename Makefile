clean:
	./gradlew clean

build_old: ./gradlew clean build

build: ./gradlew clean install checkstyleMain

install:
	./gradlew clean install

run-dist:
	./build/install/java-project-lvl1/bin/java-project-lvl1

run:
	./gradlew run

lint:
	./gradlew checkstyleMain

check-updates:
	./gradlew useLatestVersions