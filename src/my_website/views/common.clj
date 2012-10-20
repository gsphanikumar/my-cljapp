(ns my-website.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "Clojure app"]
               (include-css "/css/noir.css")]
              [:body
               [:div#wrapper
                content]]))
