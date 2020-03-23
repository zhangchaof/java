package com.learn.reactive;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: java:RxJava
 * @description:
 * @author: clark
 * @create: 2020-03-19 13:42
 **/
@Slf4j
public class RxJava {
    static Observer<Integer> observer = new Observer<Integer>() {
        @Override
        public void onSubscribe(Disposable d) {
            log.info("observer {}", "subscribe");
        }

        @Override
        public void onNext(Integer value) {
            log.info("observer {}", "" + value);
        }

        @Override
        public void onError(Throwable e) {
            log.info("observer {}", "error");
        }

        @Override
        public void onComplete() {
            log.info("observer {}", "complete");
        }
    };
    static int first = 1;
    static int second = 2;
    static int three = 3;
    static Observable<Integer> observable = Observable.create(emitter -> {
        log.info("observable begin");
        emitter.onNext(first);
        emitter.onNext(second);
        emitter.onNext(three);
        emitter.onComplete();
    });
}
