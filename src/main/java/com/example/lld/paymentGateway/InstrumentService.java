package com.example.lld.paymentGateway;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InstrumentService {
    static Map<Integer, List<Instrument>> userVsInstruments = new HashMap<>();
    public abstract InstrumentDTO addInstrument(InstrumentDTO instrumentDTO);
    public abstract List<InstrumentDTO> getInstrumentByUserId(int userId);
}
