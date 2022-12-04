# Java Test - Fluidity Software Solutions



## Getting Started

1. Add application.properties files to allow changing of port number
2. Add lombok dependency on the POM file
3. Refactor Exceptions file to CustomRunTimeException
4. Remove FixturesException to avoid duplicate code
5. Remove EventPointsException to avoid duplicate code
6. Remove BootStrapStaticException to avoid duplicate code
7. Remove CatModel
8. Remove ChipPlayModel
9. Remove ElementStatModel
10. Remove GameSettingsModel
11. Remove PhaseModel
12. Remove TopElementInfo
13. Replace getters and setters with lombok
14. Add utils and replace url in code with url in util
15. Replace url in code with url in util in fixtures
16. Add resource folder and move all resources to that folder
17. Catch exceptions on all resources files
18. Remove wildcard imports on fixture resources file
19. BootstrapService catch errors
20. Modify FixturesService to return fixtures to use in the single API
21. Add BootstrapResourceTest with hard coded pass first
22. Remove WARNING: JAXBContext implementation could not be found. WADL feature is disabled
23. The API has been structured to be one API which can be used by frontend developer using filtering. The API levels are as follows:
    a) Event
    b) Gameweek has fixtures for that week inside
    c) Inside fixtures, we have home and way teams
    d) Inside home and away teams we have players for the team
    e) Inside players we have goalkeepers, defenders, midfielder etc
    d) Inside each player type like goalkeepers we have individual information for the player
    

