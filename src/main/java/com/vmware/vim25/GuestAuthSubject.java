package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestAuthAnySubject;
import com.vmware.vim25.GuestAuthNamedSubject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthSubject")
@XmlSeeAlso({GuestAuthNamedSubject.class, GuestAuthAnySubject.class})
public class GuestAuthSubject extends DynamicData {}
