(ns htmlcss-lib.core-test-cljs
  (:require [clojure.test :refer-macros [deftest is testing]]
            [htmlcss-lib.core :refer [crt html? gen div svg is-svg-element?
                                      generate-html anmtn slctr stl
                                      form-style-content generate-style]]))

(deftest test-crt
  (testing "Test crt"
    
    (let [el nil
          cont nil
          attrs nil
          events nil
          dynamic-attrs nil
          result (crt
                   el
                   cont
                   attrs
                   events
                   dynamic-attrs)]
      
      (is
        (= result
           {:el nil
            :events nil
            :attrs nil
            :dynamic-attrs nil
            :cont nil})
       )
      
     )
    
    (let [el "div"
          cont "content"
          attrs "attrs"
          events "events"
          dynamic-attrs "dynamic-attrs"
          result (crt
                   el
                   cont
                   attrs
                   events
                   dynamic-attrs)]
      
      (is
        (= result
           {:el "div"
            :events "events"
            :attrs "attrs"
            :dynamic-attrs "dynamic-attrs"
            :cont "content"})
       )
      
     )
    
   ))

(deftest test-html?
  (testing "Test html?"
    
    (let [data nil
          result (html?
                   data)]
      
      (is
        (nil?
          result)
       )
      
     )
    
    (let [data (gen
                 (div))
          result (html?
                   data)]
      
      (is
        (true?
          result)
       )
      
     )
    
    (let [data (gen
                 (svg))
          result (html?
                   data)]
      
      (is
        (true?
          result)
       )
      
     )
    
   ))

(deftest test-is-svg-element?
  (testing "Test is svg element?"
    
    (let [element-name nil
          result (is-svg-element?
                   element-name)]
      
      (is
        (false?
          result)
       )
      
     )
    
    (let [element-name "svg"
          result (is-svg-element?
                   element-name)]
      
      (is
        (true?
          result)
       )
      
     )
    
   ))

(deftest test-generate-html
  (testing "Test generate html"
    
    (let [data nil
          result (generate-html
                   data)]
      
      (is
        (nil?
          result)
       )
      
     )
    
    (let [data (div)
          result (generate-html
                   data)]
      
      (is
        (html?
          result)
       )
      
     )
    
    (let [data (svg)
          result (generate-html
                   data)]
      
      (is
        (html?
          result)
       )
      
     )
    
   ))

(deftest test-anmtn
  (testing "Test anmtn"
    
    (let [animation-name nil
          from-props nil
          to-props nil
          result (anmtn
                   animation-name
                   from-props
                   to-props)]
      
      (is
        (= result
           {:anim "@keyframes "
            :from nil
            :to nil})
       )
      
     )
    
    (let [animation-name "animation-name"
          from-props "from-props"
          to-props "to-props"
          result (anmtn
                   animation-name
                   from-props
                   to-props)]
      
      (is
        (= result
           {:anim "@keyframes animation-name"
            :from "from-props"
            :to "to-props"})
       )
      
     )
    
   ))

(deftest test-slctr
  (testing "Test slctr"
    
    (let [selector nil
          props-map nil
          result (slctr
                   selector
                   props-map)]
      
      (is
        (= result
           {:sel nil
            :props nil})
       )
      
     )
    
    (let [selector "selector"
          props-map "props-map"
          result (slctr
                   selector
                   props-map)]
      
      (is
        (= result
           {:sel "selector"
            :props "props-map"})
       )
      
     )
    
   ))

(deftest test-stl
  (testing "Test stl"
    
    (let [id nil
          cont nil
          result (stl
                   id
                   cont)]
      
      (is
        (= result
           {:attrs {:id nil
                    :type "text/css"}
            :cont [nil]})
       )
      
     )
    
    (let [id "test"
          cont [1 2 3]
          result (stl
                   id
                   cont)]
      
      (is
        (= result
           {:attrs {:id "test"
                    :type "text/css"}
            :cont [[1 2 3]]})
       )
      
     )
    
   ))

(deftest test-form-style-content
  (testing "Test form style content"
    
    (let [data nil
          result (form-style-content
                   data)]
      
      (is
        (nil?
          result)
       )
      
     )
    
    (let [animation-class-name "animation-class-name"
          slctr-param (slctr
                        (str
                          "."
                          animation-class-name)
                        {:animation (str
                                      animation-class-name
                                      " 2s")})
          anmtn-param (anmtn
                        animation-class-name
                        {:opacity (str
                                    0)}
                        {:opacity (str
                                    1)})
          data (conj
                 slctr-param
                 anmtn-param)
          result (form-style-content
                   data)]
      
      (is
        (= result
           "@keyframes animation-class-name { from { opacity: 0; } to { opacity: 1; } } .animation-class-name { animation: animation-class-name 2s; } ")
       )
      
     )
    
   ))

(deftest test-generate-style
  (testing "Test generate style"
    
    (let [data nil
          result (generate-style
                   data)]
      
      (is
        (nil?
          result)
       )
      
     )
    
    (let [animation-class-name "animation-class-name"
          slctr-param (slctr
                        (str
                          "."
                          animation-class-name)
                        {:animation (str
                                      animation-class-name
                                      " 2s")})
          anmtn-param (anmtn
                        animation-class-name
                        {:opacity (str
                                    0)}
                        {:opacity (str
                                    1)})
          data (conj
                 slctr-param
                 anmtn-param)
          result (generate-style
                   data)]
      
      (is
        (html?
          result)
       )
      
     )
    
   ))

(deftest test-gen
  (testing "Test gen"
    
    (let [data nil
          tag-type nil
          result (gen
                   data
                   tag-type)]
      
      (is
        (nil?
          result)
       )
      
     )
    
    (let [data nil
          tag-type "style"
          result (gen
                   data
                   tag-type)]
      
      (is
        (nil?
          result)
       )
      
     )
    
    (let [data (div)
          tag-type nil
          result (gen
                   data
                   tag-type)]
      
      (is
        (html?
          result)
       )
      
     )
    
    (let [data (svg)
          tag-type nil
          result (gen
                   data
                   tag-type)]
      
      (is
        (html?
          result)
       )
      
     )
    
    (let [animation-class-name "animation-class-name"
          slctr-param (slctr
                        (str
                          "."
                          animation-class-name)
                        {:animation (str
                                      animation-class-name
                                      " 2s")})
          anmtn-param (anmtn
                        animation-class-name
                        {:opacity (str
                                    0)}
                        {:opacity (str
                                    1)})
          data (conj
                 slctr-param
                 anmtn-param)
          tag-type "style"
          result (gen
                   data
                   tag-type)]
      
      (is
        (html?
          result)
       )
      
     )
    
   ))

