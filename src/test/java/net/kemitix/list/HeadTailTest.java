package net.kemitix.list;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class HeadTailTest {

    private String headValue = "1-" + UUID.randomUUID().toString();
    private String secondValue = "2-" +  UUID.randomUUID().toString();
    private String thirdValue = "3-" + UUID.randomUUID().toString();
    private List<String> emptyList = Collections.emptyList();
    private List<String> singletonList = Collections.singletonList(headValue);
    private List<String> aList = Arrays.asList(
            headValue, secondValue, thirdValue
    );
    private List<String> tailValue = Arrays.asList(
            secondValue, thirdValue
    );

    @Test
    public void headOfAnEmptyListIsEmpty() {
        assertThat(HeadTail.head(emptyList)).isEmpty();
    }
    @Test
    public void headOfASingletonListIsTheItem() {
        assertThat(HeadTail.head(singletonList)).contains(headValue);
    }
    @Test
    public void headOfAListIsTheFirstItem() {
        assertThat(HeadTail.head(aList)).contains(headValue);
    }

    @Test
    public void tailOfAnEmptyListIsEmpty() {
        assertThat(HeadTail.tail(emptyList)).isEmpty();
    }
    @Test
    public void tailOfASingletonListIsEmpty() {
        assertThat(HeadTail.tail(singletonList)).isEmpty();
    }
    @Test
    public void tailOfAListIsMinusTheHead() {
        assertThat(HeadTail.tail(aList)).isEqualTo(tailValue);
    }
}