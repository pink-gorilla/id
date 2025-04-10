(ns human-id.core)

(def adjectives
  ["angelic"
   "blessed"
   "beautiful"
   "celestial"
   "divine"
   "energetic"
   "everlasting"
   "eternal"
   "holy"
   "infinite"
   "immortal"
   "fine"
   "godly"
   "golden"
   "graceful"
   "great"
   "heavenly"
   "holy"
   "honorable"
   "loving"
   "magnificent"
   "memorizable"
   "mighty"
   "powerful"
   "pure"
   "sacred"
   "saintly"
   "sane"
   "spiritual"
   "true"
   "white"
   "wonderful"
   "wise"])

(def nouns ["angel"
            "beginning"
            "buddah"
            "christ"
            "compassion"
            "derbish"
            "divinity"
            "earth"
            "entity"
            "eternity"
            "faith"
            "forgiveness"
            "gabriel"
            "grace"
            "god"
            "heaven"
            "holiness"
            "hope"
            "infinity"
            "james"
            "joy"
            "king"
            "light"
            "love"
            "lion"
            "magician"
            "mercy"
            "messiah"
            "monk"
            "mind"
            "origin"
            "paul"
            "peace"
            "priest"
            "queen"
            "realm"
            "redemption"
            "saint"
            "sage"
            "saviour"
            "salvation"
            "siddatha"
            "soul"
            "spirit"
            "truth"
            "thomas"
            "universal"
            "wizard"])

(defn human-id []
  (str (rand-nth adjectives) "-" (rand-nth nouns) "-"
       (rand-int 10)))

(comment
  (* (count adjectives)
     (count nouns))

  (rand-nth adjectives)

  (human-id)
;
  )