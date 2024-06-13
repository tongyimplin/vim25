package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPerfEntityMetricBase;
import com.vmware.vim25.PerfEntityMetricBase;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPerfEntityMetricBase", propOrder = {"perfEntityMetricBase"})
public class ArrayOfPerfEntityMetricBase {
  @XmlElement(name = "PerfEntityMetricBase")
  protected List<PerfEntityMetricBase> perfEntityMetricBase;
  
  public List<PerfEntityMetricBase> getPerfEntityMetricBase() {
    if (this.perfEntityMetricBase == null)
      this.perfEntityMetricBase = new ArrayList<>(); 
    return this.perfEntityMetricBase;
  }
}
