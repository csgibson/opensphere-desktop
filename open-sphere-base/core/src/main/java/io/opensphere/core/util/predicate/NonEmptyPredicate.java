package io.opensphere.core.util.predicate;

import java.util.function.Predicate;

import org.apache.commons.lang3.StringUtils;

/**
 * A predicate that accepts strings that are not empty.
 */
public class NonEmptyPredicate implements Predicate<String>
{
    @Override
    public boolean test(String value)
    {
        return StringUtils.isNotEmpty(value);
    }
}
