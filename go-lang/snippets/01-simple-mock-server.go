package main

import (
	"io/ioutil"
	"net/http"
)

func main() {
	http.HandleFunc("/v1/predict/social_proof", dsp)
	http.HandleFunc("/location", location)
	http.HandleFunc("/carousel/aggregator", listing)
	http.HandleFunc("/pricing/context/", context)

	http.Handle("/favicon.ico", http.NotFoundHandler())
	http.ListenAndServe(":9090", nil)
	// http.ListenAndServe(":" + os.Getenv("PORT"), nil)
}

func dsp(w http.ResponseWriter, req *http.Request) {
	b, err := ioutil.ReadFile("dsp.json")
	if err != nil {
		panic(err)
	}
	w.Header().Set("Content-Type", "application/json")
	w.Write(b)
}

func location(w http.ResponseWriter, req *http.Request) {
	b, err := ioutil.ReadFile("location.json")
	if err != nil {
		panic(err)
	}
	w.Header().Set("Content-Type", "application/json")
	w.Write(b)
}

