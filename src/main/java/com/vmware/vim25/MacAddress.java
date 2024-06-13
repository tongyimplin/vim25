package com.vmware.vim25;

import com.vmware.vim25.MacRange;
import com.vmware.vim25.NegatableExpression;
import com.vmware.vim25.SingleMac;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MacAddress")
@XmlSeeAlso({MacRange.class, SingleMac.class})
public class MacAddress extends NegatableExpression {}
