# PKCE

The Proof Key for Code Exchange (PKCE) is an extension to the OAUth2 Authorization Code flow. 
It describes a technique for public clients to mitigate the threat of having the authorization code intercepted. 
The technique involves the client first creating a secret, and then using that secret again when exchanging the 
authorization code for an access token. This way if the code is intercepted, it will not be useful since the token 
request relies on the initial secret.

See more https://www.oauth.com/oauth2-servers/pkce/

This project generates code verifier, then based on generated code verifier it generates code challenge.