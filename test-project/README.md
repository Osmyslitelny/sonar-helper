Full command with compile, test, jacoco, jacoco html report and sonar analysis. Split command if you needed.
Add some profile to command (`-Psimulate-branch` or `-Psimulate-branch`)
```
mvn clean jacoco:prepare-agent test jacoco:report sonar:sonar XXX_PROFILE_NAME_XXX
```
