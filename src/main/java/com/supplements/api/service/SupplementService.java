package com.supplements.api.service;

import com.supplements.api.model.Supplement;

import java.util.Arrays;
import java.util.List;

public class SupplementService {
    public final static List<Supplement> supplements = Arrays.asList(
            new Supplement("Whey Protein"),
            new Supplement("Creatina"),
            new Supplement("BCAA"));

    public static List<Supplement> getAll() {
        return supplements;
    }
}
