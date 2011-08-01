(ns match.test.core
  (:refer-clojure :exclude [reify == inc compile])
  (:use [match.core])
  (:use [clojure.test]))

(deftest pattern-sorted-set-test
         (is (-> (sorted-set (literal-pattern nil)
                             (literal-pattern nil))
               count
               (= 1))))

(deftest type-pattern-precondition-test
         (is
           (thrown? java.lang.AssertionError
                    (type-pattern 1))))

(deftest vector-pattern-precondition-test
         (is
           (thrown? java.lang.AssertionError
                    (vector-pattern 1))))
