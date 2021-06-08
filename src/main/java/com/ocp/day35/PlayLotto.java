package com.ocp.day35;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PlayLotto {
    public static void main(String[] args) throws Exception {
        System.out.println("準備開獎");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Lotto>> list = new ArrayList<>();
        list.add(new LottoMachine(1));
        list.add(new LottoMachine(2));
        list.add(new LottoMachine(3));
        list.add(new LottoMachine(4));
        list.add(new LottoMachine(5));
        System.out.println("開始搖獎");
        List<Future<Lotto>> results = service.invokeAll(list);
        System.out.println("唱名獎號");
        results.forEach(f -> {
            try {
                System.out.println(f.get());
            } catch (Exception e) {
            }
        });
        service.shutdown();
        System.out.println("開獎結束");
    }
}
