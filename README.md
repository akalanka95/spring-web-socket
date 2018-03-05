Web Socket
===========

WebSockets is a protocol and a JavaScript API, the protocol is a very low level, full-duplex protocol, which means that messages can be sent in both directions simultaneous. It made it possible for the server to send data to the client, in stead of doing the opposite. Polling and long-polling were no longer necessary, and they lived happily ever after.

What is STOMP? 
================

Like I said before, the WebSocket protocol is a pretty low-level protocol, however, there are a few high(er) level protocols that can be used on top of WebSockets, for example MQTT and STOMP. STOMP for example adds extra possibilities to WebSockets, like publishing and subscribing to topics.

SockJS
=======

SockJS is a browser JavaScript library that provides a WebSocket-like object. SockJS gives you a coherent, cross-browser, Javascript API which creates a low latency, full duplex, cross-domain communication channel between the browser and the web server.
