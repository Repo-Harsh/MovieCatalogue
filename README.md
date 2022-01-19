# MovieCatalogue
It contains Eureka Server and 3 sprint boot ms.

Discover server is Eureka server and rest are configured to be Eureka CLient

Movie Catalogue Service first calls movie rating service using UserId
This returns list of object and each object has movieID and ratings.

Movie id is used to fetch movie details from movie info services.
movie info services connects with TMDB for fetching different Movie Descriptions according to IDs.

