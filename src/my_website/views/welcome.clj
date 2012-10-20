(ns my-website.views.welcome
  (:require [my-website.views.common :as common]
            )
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           [:p.announce "Welcome to my first clojure web app"]
	    [:input {:type "text"}]
	    ))
