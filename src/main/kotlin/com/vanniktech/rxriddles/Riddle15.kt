package com.vanniktech.rxriddles

import io.reactivex.Observable
import io.reactivex.disposables.Disposable

object Riddle15 {
  /**
   * Concatenate the [first] Observable with the [second] while subscribing to both early.
   *
   * Use case: You have two sources of your data (cache & network request). You want to subscribe to both right away and keep the emission order.
   */
  fun solve(first: Observable<Int>, second: Observable<Int>): Observable<Int> {
    return Observable.concatEager(listOf(first, second))
  }
}
