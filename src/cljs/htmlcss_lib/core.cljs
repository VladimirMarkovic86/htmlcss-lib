(ns htmlcss-lib.core)

(defn- crt
  "Create clojure map that represents HTML element
   
   el String that represents HTML element
   cont Content of HTML that can be string, new crt fn call or vector of crt fn calls
   attrs Attrs is a map of attributes for particular HTML element
    {:style {:width \"50px\"}
     :id \"id\"}
   events Events is a map of events on particular HTML element
    {:onclick {:evt-fn <fn-name>
               :evt-p <fn-param-name>}}
   "
  [el
   & [cont
      attrs
      events]]
  {:el el
   :events events
   :attrs attrs
   :cont cont})

(defn html
 ""
 [& [cont
     attrs
     events]]
 (crt "html"
      cont
      attrs
      events))

(defn head
 ""
 [& [cont
     attrs
     events]]
 (crt "head"
      cont
      attrs
      events))

(defn title
 ""
 [& [cont
     attrs
     events]]
 (crt "title"
      cont
      attrs
      events))

(defn body
 ""
 [& [cont
     attrs
     events]]
 (crt "body"
      cont
      attrs
      events))

(defn p
 ""
 [& [cont
     attrs
     events]]
 (crt "p"
      cont
      attrs
      events))

(defn h1
 ""
 [& [cont
     attrs
     events]]
 (crt "h1"
      cont
      attrs
      events))

(defn h2
 ""
 [& [cont
     attrs
     events]]
 (crt "h2"
      cont
      attrs
      events))

(defn h3
 ""
 [& [cont
     attrs
     events]]
 (crt "h3"
      cont
      attrs
      events))

(defn h4
 ""
 [& [cont
     attrs
     events]]
 (crt "h4"
      cont
      attrs
      events))

(defn h5
 ""
 [& [cont
     attrs
     events]]
 (crt "h5"
      cont
      attrs
      events))

(defn h6
 ""
 [& [cont
     attrs
     events]]
 (crt "h6"
      cont
      attrs
      events))

(defn pre
 ""
 [& [cont
     attrs
     events]]
 (crt "pre"
      cont
      attrs
      events))

(defn b
 ""
 [& [cont
     attrs
     events]]
 (crt "b"
      cont
      attrs
      events))

(defn strong
 ""
 [& [cont
     attrs
     events]]
 (crt "strong"
      cont
      attrs
      events))

(defn i
 ""
 [& [cont
     attrs
     events]]
 (crt "i"
      cont
      attrs
      events))

(defn em
 ""
 [& [cont
     attrs
     events]]
 (crt "em"
      cont
      attrs
      events))

(defn mark
 ""
 [& [cont
     attrs
     events]]
 (crt "mark"
      cont
      attrs
      events))

(defn small
 ""
 [& [cont
     attrs
     events]]
 (crt "small"
      cont
      attrs
      events))

(defn del
 ""
 [& [cont
     attrs
     events]]
 (crt "del"
      cont
      attrs
      events))

(defn ins
 ""
 [& [cont
     attrs
     events]]
 (crt "ins"
      cont
      attrs
      events))

(defn sub
 ""
 [& [cont
     attrs
     events]]
 (crt "sub"
      cont
      attrs
      events))

(defn sup
 ""
 [& [cont
     attrs
     events]]
 (crt "sup"
      cont
      attrs
      events))

(defn q
 ""
 [& [cont
     attrs
     events]]
 (crt "q"
      cont
      attrs
      events))

(defn blockquote
 ""
 [& [cont
     attrs
     events]]
 (crt "blockquote"
      cont
      attrs
      events))

(defn nav
 ""
 [& [cont
     attrs
     events]]
 (crt "nav"
      cont
      attrs
      events))

(defn a
 ""
 [& [cont
     attrs
     events]]
 (crt "a"
      cont
      attrs
      events))

(defn img
 ""
 [& [cont
     attrs
     events]]
 (crt "img"
      cont
      attrs
      events))

(defn button
 ""
 [& [cont
     attrs
     events]]
 (crt "button"
      cont
      attrs
      events))

(defn input
 ""
 [& [cont
     attrs
     events]]
 (crt "input"
      cont
      attrs
      events))

(defn textarea
 ""
 [& [cont
     attrs
     events]]
 (crt "textarea"
      cont
      attrs
      events))

(defn select
 ""
 [& [cont
     attrs
     events]]
 (crt "select"
      cont
      attrs
      events))

(defn option
 ""
 [& [cont
     attrs
     events]]
 (crt "option"
      cont
      attrs
      events))

(defn ul
 ""
 [& [cont
     attrs
     events]]
 (crt "ul"
      cont
      attrs
      events))

(defn li
 ""
 [& [cont
     attrs
     events]]
 (crt "li"
      cont
      attrs
      events))

(defn table
 ""
 [& [cont
     attrs
     events]]
 (crt "table"
      cont
      attrs
      events))

(defn thead
 ""
 [& [cont
     attrs
     events]]
 (crt "thead"
      cont
      attrs
      events))

(defn tbody
 ""
 [& [cont
     attrs
     events]]
 (crt "tbody"
      cont
      attrs
      events))

(defn tr
 ""
 [& [cont
     attrs
     events]]
 (crt "tr"
      cont
      attrs
      events))

(defn th
 ""
 [& [cont
     attrs
     events]]
 (crt "th"
      cont
      attrs
      events))

(defn td
 ""
 [& [cont
     attrs
     events]]
 (crt "td"
      cont
      attrs
      events))

(defn div
 ""
 [& [cont
     attrs
     events]]
 (crt "div"
      cont
      attrs
      events))

(defn label
 ""
 [& [cont
     attrs
     events]]
 (crt "label"
      cont
      attrs
      events))

(defn span
 ""
 [& [cont
     attrs
     events]]
 (crt "span"
      cont
      attrs
      events))

(defn style
 ""
 [& [cont
     attrs
     events]]
 (crt "style"
      cont
      (assoc attrs :type "text/css")
      events))

(defn script
 ""
 [& [cont
     attrs
     events]]
 (crt "script"
      cont
      (assoc attrs :type "text/javascript")
      events))

;(defn css
; ""
; [selector
;  props]
; (str selector)
; )

;(defn keyframes
; ""
; [animation-name
;  & [props]]
; (let [props-keys (keys props)]
;  
;  )
; )

;(defn media
; ""
; []
; 
; )

(defn- generate-html
 "Generates HTML element out of clojure map created by crt fn"
 [data]
 (if (map? data)
   (let [el (:el data)
         cont (:cont data)
         new-element (.createElement js/document el)
         attrs (:attrs data)
         events (:events data)]
    (doseq [[attr-name
             attr-value] attrs]
     (let [attr-cont (atom "")]
      (if (and (= attr-name
                  :style)
               (map? attr-value))
       (doseq [[prop-name
                prop-value] attr-value]
        (swap! attr-cont str (name prop-name)
                             ": "
                             prop-value
                             "; "))
       (swap! attr-cont str attr-value))
      (.setAttribute new-element (name attr-name)
                                 @attr-cont))
     )
    (doseq [[evt-name
             {evt-fn :evt-fn
              evt-p :evt-p}] events]
     (aset new-element (name evt-name)
                       #(evt-fn evt-p
                                new-element)
      ))
    (if (or (string? cont)
            (number? cont))
     (aset new-element "innerHTML" cont)
     (if (vector? cont)
      (do 
       (doseq [cont-element cont]
        (.appendChild new-element (generate-html cont-element))
        ))
      (if (map? cont)
       (.appendChild new-element (generate-html cont))
       ""))
     )
    new-element)
  (if (vector? data)
   (let [generated-htmls (atom [])]
    (doseq [data-element data]
     (swap! generated-htmls conj (generate-html data-element))
     )
    @generated-htmls)
   nil))
 )

(defn anmtn
  "Generate map that represents animation in css style
   
   animation-name Is animation name
   from-props Is map of properties at the start of animation
    {:width \"50px\"}
   to-props Is map of properties at the end of animation
    {:width \"100px\"}"
  [animation-name
   from-props
   to-props]
  {:anim (str "@keyframes "
              animation-name)
   :from from-props
   :to to-props})

(defn slctr
  "Generate map that represents selector and it's properties
   
   selector Is a css selector
   props-map Is map of properties applied to element selected by selector"
  [selector
   props-map]
  {:sel selector
   :props props-map})

(defn stl
  "Generate map that represents style HTML element
  
   id Is identification of style HTML element
   cont Is a content of style HTML element that can be map generated by anmtn or slctr fns
    or vector of these maps"
  [id
   & cont]
  {:attrs {:id id
           :type "text/css"}
   :cont (vec cont)})

(defn- form-style-content
  "Generate string that represents selector or animation of style HTML element"
  [data]
  (let [sel (:sel data)
        props (:props data)
        anim (:anim data)
        from-props (:from data)
        to-props (:to data)
        content (atom "")]
   (when sel
    (swap! content str sel
                       " { ")
    (doseq [[prop-name
             prop-value] props]
     (swap! content str (name prop-name)
                        ": "
                        prop-value
                        "; ")))
   (when anim
    (swap! content str anim
                       " { "
                       "from { ")
    (doseq [[prop-name
             prop-value] from-props]
     (swap! content str (name prop-name)
                        ": "
                        prop-value
                        "; "))
    (swap! content str "} ")
    (swap! content str "to { ")
    (doseq [[prop-name
             prop-value] to-props]
     (swap! content str (name prop-name)
                        ": "
                        prop-value
                        "; "))
    (swap! content str "} "))
   (swap! content str "} ")
   @content))

(defn- generate-style
  "Generates style HTML element from clojure map generated by stl fn"
  [data]
  (if (map? data)
   (let [new-element (.createElement js/document "style")
         attrs (:attrs data)
         cont (:cont data)]
    (if (string? cont)
     (aset new-element "innerHTML" cont)
     (if (vector? cont)
      (doseq [cont-element cont]
       (aset new-element "innerHTML" (str (aget new-element "innerHTML")
                                          " "
                                          (form-style-content cont-element))
        ))
      (if (map? cont)
       (aset new-element "innerHTML" (form-style-content cont))
       (aset new-element "innerHTML" (form-style-content data))
       ))
     )
    (doseq [[attr-name
             attr-value] attrs]
     (.setAttribute new-element (name attr-name)
                                attr-value))
    new-element)
   nil))

(defn gen
  "Generate HTML element from map generated by crt or stl fns"
  [data
  & [tag-type]]
  (if (= tag-type
         "style")
   (generate-style data)
   (generate-html data))
  )

