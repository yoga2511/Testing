package com.example.testing2;

import java.util.concurrent.TimeUnit;

import org.junit.runners.model.InvalidTestClassError;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.trace.ReadWriteSpan;
import io.opentelemetry.sdk.trace.data.SpanData;

public class day9_5_1 implements ReadWriteSpan
    {
	public void onTestStart(day9_5_1 result) {
		System.out.println("Test State : "+result.getName()); 
		
	}

	public void onTestSuccess(InvalidTestClassError result) {
		
		System.out.println("Test success : "+result.getLocalizedMessage());
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail : "+result.getName());
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(InvalidTestClassError context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Span addEvent(String arg0, Attributes arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Span addEvent(String arg0, Attributes arg1, long arg2, TimeUnit arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void end(long arg0, TimeUnit arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SpanContext getSpanContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRecording() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Span recordException(Throwable arg0, Attributes arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Span setAttribute(AttributeKey<T> arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Span setStatus(StatusCode arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Span updateName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getAttribute(AttributeKey<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstrumentationLibraryInfo getInstrumentationLibraryInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpanKind getKind() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getLatencyNanos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpanContext getParentSpanContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasEnded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SpanData toSpanData() {
		// TODO Auto-generated method stub
		return null;
	}

}
